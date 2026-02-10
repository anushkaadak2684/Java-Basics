import java.util.*;
public class DuplicatesRemoval{
    public static void duplicatesRemoval(String str, int i, StringBuilder newstr, boolean map[]){
        if(i == str.length()){
            System.out.println("String after removing duplicates: " + newstr);
            return;
        }

        char currchar = str.charAt(i);
        if(map[currchar - 'a'])
            duplicatesRemoval(str, i+1, newstr, map);
        else{
            map[currchar - 'a'] = true;
            duplicatesRemoval(str, i+1, newstr.append(currchar), map);
            }
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        System.out.print("Enter a string: ");
        String str = in.next();
        duplicatesRemoval(str, 0, newstr, map);
        in.close();
    }
}
