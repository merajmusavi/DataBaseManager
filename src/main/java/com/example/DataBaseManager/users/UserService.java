package com.example.DataBaseManager.users;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    List<DataModel> allUsers() {
        return userRepository.findAll();
    }

    Optional<DataModel> getUserById(Long id) {
        return userRepository.findById(id).or(() -> Optional.of(new DataModel( "not found", "not found", "not found")));
    }

    void insertUser(DataModel dataModel){
        List<DataModel> all = userRepository.findAll();
        DataModel dataModel1 = all.get(all.size() - 1);
        dataModel.setId(dataModel1.getId()+1);
        userRepository.save(dataModel);
    }

    void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
    void deactiveUser(DeActiveModel deActiveModel) throws URISyntaxException, IOException, InterruptedException {

        String user = new Gson().toJson(deActiveModel);

        HttpRequest req = HttpRequest.newBuilder()
                .uri(new URI("http://185.238.2.38:6992/api/deactive"))
                .header("Content-type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(user))
                .build();
        HttpResponse<String> httpResponse = HttpClient.newHttpClient()
                .send(req,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
    }

    Optional<User> speceficuserselectionDataDTO(String username) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("http://185.238.2.38:6992/api/{token}/user/"+username))
                .build();
        HttpResponse<String> httpResponse = HttpClient.newHttpClient()
                .send(httpRequest,HttpResponse.BodyHandlers.ofString());


        JsonArray jsonElements = JsonParser.parseString(httpResponse.body()).getAsJsonArray();

        User user  = new Gson().fromJson(jsonElements.get(0),User.class);

        SPECEFICUSERSELECTIONDataDTO.AdditionalData additionalData = new Gson().fromJson(jsonElements.get(1),SPECEFICUSERSELECTIONDataDTO.AdditionalData.class);


        User result = new User();

        result.setUser(user);

        return Optional.of(result);




    }

}
