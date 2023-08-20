package TDT.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import lombok.var;
import org.apache.commons.io.FileUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

    public static List<HashMap<String, String>> getJsonDataToMap() throws IOException {
		var file = new File(System.getProperty("user.dir") + "//src//test//java//TDT//data//Login.json");
        String jsonContent = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
		var typeReference = new TypeReference<List<HashMap<String, String>>>() {};
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, typeReference);
        return data;
    }
}
