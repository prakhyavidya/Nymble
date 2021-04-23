import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class PasswordGenerator {


char numberChars[] = "0123456789".toCharArray();


char lowerChars[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();


char upperChars[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


char otherSpecialChars[] = "`~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?".toCharArray();


List <Integer>listForLengthOfPassword = new ArrayList<Integer>();


Random random = new Random();


List <Character>finalpasswordList;


public PasswordGenerator(){

listForLengthOfPassword.add(1);
listForLengthOfPassword.add(2);
listForLengthOfPassword.add(2);
listForLengthOfPassword.add(3);
}


public String getPassword(){

Collections.shuffle(listForLengthOfPassword);
finalpasswordList = new ArrayList<Character>();

for(int t=0;t<listForLengthOfPassword.size();t++){

int numberOfCharPerArray = listForLengthOfPassword.get(t);
for(int z=0;z<numberOfCharPerArray;z++){

if(t == 0){

finalpasswordList.add(numberChars[random.nextInt(10)]);
}else if(t == 1){

finalpasswordList.add(lowerChars[random.nextInt(26)]);
}else if(t == 2){

finalpasswordList.add(upperChars[random.nextInt(26)]);
}


else if(t == 3){

finalpasswordList.add(otherSpecialChars[random.nextInt(32)]);
}

}//end for

}//end for

String password = new String();
Collections.shuffle(finalpasswordList);
for(int s=0;s<finalpasswordList.size();s++){

password += finalpasswordList.get(s);
}
return password;
}


public static void main(String args[]){

PasswordGenerator passwordGenerator = new PasswordGenerator();

//for(int u=0; u<1000; u++)
{

System.out.println(passwordGenerator.getPassword());
}
}

}