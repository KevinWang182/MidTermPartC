package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        String name, genre = "";
        
        System.out.print("Name: ");
        name = input.next();
        for(String g : genres)
            System.out.print(g + ", ");
        System.out.print("\nPick a genre: ");
        genre = input.next();
        
        UserProfile user = new UserProfile(name, genre);
        System.out.println("User profile created!");
    }
    
}
