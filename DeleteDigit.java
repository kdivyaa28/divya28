import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeleteDigit {

public static List splitAndGiveList(String number){
int length=number.length();
List list=new ArrayList();
for(int i=0;i<length;i++){
String newNum=number.substring(0,i)+number.substring(i+1,length);
list.add(Integer.parseInt(newNum));
}
Collections.sort(list);
return list;
}

public static void findLeast(String number,int noOfDigit){
Integer leastNo=0;
for(int i=0;i<noOfDigit;i++){
leastNo=splitAndGiveList(number).get(0);
number=leastNo.toString();
}
System.out.println(leastNo);
}
/**
* @param args
*/
public static void main(String[] args) {
findLeast("24631",3);

}

}
