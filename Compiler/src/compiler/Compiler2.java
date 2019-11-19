package compiler;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Compiler2 {
    
    private static void writeOnFile(String name, String content) {
        try {
            OutputStreamWriter file = new OutputStreamWriter(new FileOutputStream("/home/danielcqgt4/Documentos/FrameWorks/CyCStyles/" + name + ".css",true),StandardCharsets.UTF_8);
            //file.writeUTF(content);
            file.append(content);
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void createColors(){
        int temp = 1;
        String result;
        while (temp <= 80) {
            result = ".text-size-"+temp+"{"
                    + "font-size: "+temp+"%;"
                    + "}";
            writeOnFile("sizeText", result);
            temp++;
        }
    }
    
}
