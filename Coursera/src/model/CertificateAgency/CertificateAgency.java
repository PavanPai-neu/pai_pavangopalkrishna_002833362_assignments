/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CertificateAgency;

import java.util.Map;

/**
 *
 * @author anirudh
 */
public class CertificateAgency {
    
    public static boolean evaluateTranscript(StudentTranscript studentTranscript)
    {
        boolean flag = true;
        System.out.println(studentTranscript.courseEntry.size());
        for(Map.Entry<String, TranscriptCourse> entry: studentTranscript.courseEntry.entrySet())
        {
            
            if((int)entry.getValue().getGrade().charAt(0) <= (int)('B'))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static void generateCertificate(StudentTranscript studentTranscript)
    {
        
    }
    
}
