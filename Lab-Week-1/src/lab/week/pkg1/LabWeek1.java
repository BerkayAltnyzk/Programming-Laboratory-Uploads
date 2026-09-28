package lab.week.pkg1;

import java.util.Scanner;

public class LabWeek1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("WELCOME TO THE FOOTBALL TOURNAMENT!");
        
        System.out.println("Match 1: Team A vs Team B");
        
        System.out.println("Match 2: Team C vs Team D");
        
        System.out.println("Match 3: Team A vs Team C");
        
        System.out.println("Match 4: Team B vs Team D");
        
        System.out.println("Match 5: Team A vs Team D");
        
        System.out.println("Match 6: Team B vs Team C");
        
        System.out.println();

      
        int m1_a, m1_b;
        
        int m2_c, m2_d;
        
        int m3_a, m3_c;
        
        int m4_b, m4_d;
        
        int m5_a, m5_d;
        
        int m6_b, m6_c;
             
        System.out.println("=== ENTER SCORES ===");
        
        
        System.out.print("Match 1: Team A vs Team B - Team A goals: ");
        
        m1_a = scanner.nextInt();
        
        System.out.print("Match 1: Team A vs Team B - Team B goals: ");
        
        m1_b = scanner.nextInt();

        System.out.print("Match 2: Team C vs Team D - Team C goals: ");
        
        m2_c = scanner.nextInt();
        
        System.out.print("Match 2: Team C vs Team D - Team D goals: ");
        m2_d = scanner.nextInt();
        

        System.out.print("Match 3: Team A vs Team C - Team A goals: ");
        
        m3_a = scanner.nextInt();
        
        System.out.print("Match 3: Team A vs Team C - Team C goals: ");
        
        m3_c = scanner.nextInt();

        System.out.print("Match 4: Team B vs Team D - Team B goals: ");
        
        m4_b = scanner.nextInt();
        
        System.out.print("Match 4: Team B vs Team D - Team D goals: ");
        
        m4_d = scanner.nextInt();

        System.out.print("Match 5: Team A vs Team D - Team A goals: ");
        
        m5_a = scanner.nextInt();
        
        System.out.print("Match 5: Team A vs Team D - Team D goals: ");
        
        m5_d = scanner.nextInt();

        System.out.print("Match 6: Team B vs Team C - Team B goals: ");
        
        m6_b = scanner.nextInt();
        
        System.out.print("Match 6: Team B vs Team C - Team C goals: ");
        
        m6_c = scanner.nextInt();

       
        System.out.println();
        
        System.out.println("=== ALL ENTERED MATCH SCORES ===");
        
        System.out.println("Match 1: Team A " + m1_a + " - " + m1_b + " Team B");
        
        System.out.println("Match 2: Team C " + m2_c + " - " + m2_d + " Team D");
        
        System.out.println("Match 3: Team A " + m3_a + " - " + m3_c + " Team C");
        
        System.out.println("Match 4: Team B " + m4_b + " - " + m4_d + " Team D");
        
        System.out.println("Match 5: Team A " + m5_a + " - " + m5_d + " Team D");
        
        System.out.println("Match 6: Team B " + m6_b + " - " + m6_c + " Team C");
        
     
        int a_played = 0, a_wins = 0, a_draws = 0, a_losses = 0, a_gf = 0, a_ga = 0, a_points = 0;
        
        int b_played = 0, b_wins = 0, b_draws = 0, b_losses = 0, b_gf = 0, b_ga = 0, b_points = 0;
        
        int c_played = 0, c_wins = 0, c_draws = 0, c_losses = 0, c_gf = 0, c_ga = 0, c_points = 0;
        
        int d_played = 0, d_wins = 0, d_draws = 0, d_losses = 0, d_gf = 0, d_ga = 0, d_points = 0;
       
     
        a_played++;
        
        b_played++;
        
        a_gf += m1_a;
        
        a_ga += m1_b;
        
        b_gf += m1_b;
        
        b_ga += m1_a;
        
        if (m1_a > m1_b) {
            
            a_wins++;
            
            a_points += 3;
            
            b_losses++;
            
        } else if (m1_b > m1_a) {
            
            b_wins++;
            
            b_points += 3;
            
            a_losses++;
            
        } else {
            
            a_draws++;
            
            b_draws++;
            
            a_points += 1;
            
            b_points += 1;
            
        }

        c_played++;
        
        d_played++;
        
        c_gf += m2_c;
        
        c_ga += m2_d;
        
        d_gf += m2_d;
        
        d_ga += m2_c;
        
        if (m2_c > m2_d) {
            
            c_wins++;
            
            c_points += 3;
            
            d_losses++;
            
        } else if (m2_d > m2_c) {
            
            d_wins++;
            
            d_points += 3;
            
            c_losses++;
            
        } else {
            
            c_draws++;
            
            d_draws++;
            
            c_points += 1;
            
            d_points += 1;
            
        }

     
        a_played++;
        
        c_played++;
        
        a_gf += m3_a;
        
        a_ga += m3_c;
        
        c_gf += m3_c;
        
        c_ga += m3_a;
        
        if (m3_a > m3_c) {
            
            a_wins++;
            
            a_points += 3;
            
            c_losses++;
            
        } else if (m3_c > m3_a) {
            
            c_wins++;
            
            c_points += 3;
            
            a_losses++;
            
        } else {
            
            a_draws++;
            
            c_draws++;
            
            a_points += 1;
            
            c_points += 1;
            
        }

     
        b_played++;
        
        d_played++;
        
        b_gf += m4_b;
        
        b_ga += m4_d;
        
        d_gf += m4_d;
        
        d_ga += m4_b;
        
        if (m4_b > m4_d) {
            
            b_wins++;
            
            b_points += 3;
            
            d_losses++;
            
        } else if (m4_d > m4_b) {
            
            d_wins++;
            
            d_points += 3;
            
            b_losses++;
            
        } else {
            
            b_draws++;     
            
            d_draws++;
            
            b_points += 1;
            
            d_points += 1;
            
        }

    
        a_played++;
        
        d_played++;
        
        a_gf += m5_a;
        
        a_ga += m5_d;
        
        d_gf += m5_d;
        
        d_ga += m5_a;
        
        if (m5_a > m5_d) {
            
            a_wins++;
            
            a_points += 3;
            
            d_losses++;
            
        } else if (m5_d > m5_a) {
            
            d_wins++;
            
            d_points += 3;
            
            a_losses++;
            
        } else {
            
            a_draws++;
            
            d_draws++;
            
            a_points += 1;
            
            d_points += 1;
            
        }

  
        b_played++;
        
        c_played++;
        
        b_gf += m6_b;
        
        b_ga += m6_c;
        
        c_gf += m6_c;
        
        c_ga += m6_b;
        
        if (m6_b > m6_c) {
            
            b_wins++;
            
            b_points += 3;
            
            c_losses++;
            
        } else if (m6_c > m6_b) {
            
            c_wins++;
            
            c_points += 3;
            
            b_losses++;
            
        } else {
            
            b_draws++;
            
            c_draws++;
            
            b_points += 1;
            
            c_points += 1;
            
        }

    
        int a_gd = a_gf - a_ga;
        
        int b_gd = b_gf - b_ga;
        
        int c_gd = c_gf - c_ga;
        
        int d_gd = d_gf - d_ga;

      
        System.out.println();
        
        System.out.println("=== STANDINGS TABLE ===");
        
        System.out.println("Team\t\tP\tW\tD\tL\tGD\tPts");
        
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Team A\t\t" + a_played + "\t" + a_wins + "\t" + a_draws + "\t" + a_losses + "\t" + a_gd + "\t" + a_points);
        
        System.out.println("Team B\t\t" + b_played + "\t" + b_wins + "\t" + b_draws + "\t" + b_losses + "\t" + b_gd + "\t" + b_points);
        
        System.out.println("Team C\t\t" + c_played + "\t" + c_wins + "\t" + c_draws + "\t" + c_losses + "\t" + c_gd + "\t" + c_points);
        
        System.out.println("Team D\t\t" + d_played + "\t" + d_wins + "\t" + d_draws + "\t" + d_losses + "\t" + d_gd + "\t" + d_points);

    }
}
