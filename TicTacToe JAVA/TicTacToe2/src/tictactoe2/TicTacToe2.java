/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.Random;


public class TicTacToe2 {
    
    static Scanner csc = new Scanner(System.in);
    
    public static void display(String board []){  
    System.out.println("   |   |");
    System.out.println(" " + board[7] + " | "+board[8]+" | "+board[9]);
    System.out.println("   |   |");
    System.out.println("-----------");  
    System.out.println("   |   |");
    System.out.println(" "+board[4]+" | "+board[5]+" | "+board[6]);
    System.out.println("   |   |");
    System.out.println("-----------");
    System.out.println("   |   |");
    System.out.println(" "+board[1]+" | "+board[2]+" | "+board[3]);
    System.out.println("   |   |");
    }
    
    public static boolean space_check(String [] board, int position){
    
    return board[position] == " ";
    }
        
    public static int player_choice(String [] board){
        int position = 0;
        boolean ask = true;
        while(ask){
            try{
                System.out.println("Choose your position from 1 to 9 (Starting from left bottom to top right) only in the empty space");
                position=csc.nextInt();
                if( board[position].equals("X") || board[position].equals("O") ){
                System.out.println("Already booked position. Try somewhere else");
                continue;
            }
            ask = false;
            break;
                }catch(Exception e){ 
                    System.out.println("Wrong Input");
                    break;
                }
            
        }
        return position;
    }
    
    public static int computer_choice(String [] board,int n,String sign,String comp){
        int place = 0;
        if(n==1){
           place = 3;
        }
        else if(n==3){
            if( sign.equals(board[9]) || sign.equals(board[6]) || sign.equals(board[8]) ){
                place = 1;
            }
            else if( sign.equals(board[5]) ){
                place = 7;
            }
            else{
                place = 9;
            }
        }
        else if(n==5){
         if( ( sign.equals(board[9]) || sign.equals(board[6]) ) && comp.equals(board[1]) ){
              if( sign.equals(board[2]) ){
                  place = 7;
              }
              else{
             place = 2;
            }
         }

         else if( sign.equals(board[7]) && comp.equals(board[9]) ){
             if( sign.equals(board[6]) ){
                 place = 1; 
             }
             else{
                 place = 6;
             }
               
        }
         else if( sign.equals(board[5]) && comp.equals(board[7]) ){
              if( sign.equals(board[9]) ){
                  place = 1;
              }
              else if( sign.equals(board[1]) ){
                  place = 9;
              }
              else if( sign.equals(board[2]) ){
                  place = 8;
              }
              else if( sign.equals(board[4]) ){
                  place = 6;
              }
              else if( sign.equals(board[8]) ){
                  place = 2;
              }
              else if( sign.equals(board[6]) ){
                  place = 4;
              }
        }
          else if( sign.equals(board[4]) && comp.equals(board[9]) ){
              if( sign.equals(board[6]) ){
              place = 5;
              }
              else{
                  place = 6;
              }
       }
          else if( sign.equals(board[8]) || comp.equals(board[1]) ) {
              if( sign.equals(board[2]) ){
             place = 5; 
          }
              else{
                  place = 2;
              }
        }
          else if( sign.equals(board[1]) || comp.equals(board[9]) ) {
              if( sign.equals(board[6]) ){
             place = 7; 
          }
              else{
                  place = 6;
              }
        }
         else if( sign.equals(board[2]) || comp.equals(board[9]) ) {
              if( sign.equals(board[6]) ){
             place = 7; 
          }
              else{
                  place = 6;
              }
        }
        }
          
        else if(n==7){
            if( sign.equals(board[9]) && comp.equals(board[1]) && sign.equals(board[2]) && comp.equals(board[7]) ){
                if( sign.equals(board[5]) ){
                    place = 4;
                }
                else if(sign.equals(board[4])){
                    place = 5;
                }
                else{
                    place = 4;
                }
            }
            else if( sign.equals(board[6]) && comp.equals(board[1]) && sign.equals(board[2]) && comp.equals(board[7]) ){
                 if( sign.equals(board[5]) ){
                    place = 4;
                }
                else if(sign.equals(board[4])){
                    place = 5;
                }
                else{
                    place = 4;
                }
            }
            else if( sign.equals(board[7]) && comp.equals(board[9]) && sign.equals(board[6]) && comp.equals(board[1]) ){
                 if( sign.equals(board[2]) ){
                    place = 5;
                }
                else if( sign.equals(board[5] )){
                    place = 2;
                }
                else{
                    place = 2;
                }
                 
            }
            else if( sign.equals(board[4]) && comp.equals(board[9]) && sign.equals(board[6]) && comp.equals(board[5]) ){
                 if( sign.equals(board[1]) ){
                    place = 7;
                }
                else if( sign.equals(board[7])){
                    place = 1;
                }
                else{
                    place = 1;
                }
            }
            else if( sign.equals(board[1]) && comp.equals(board[9]) && sign.equals(board[6]) && comp.equals(board[7])){
                 if( sign.equals(board[5]) ){
                    place = 8;
                }
                else if( sign.equals(board[8]) ){
                    place = 5;
                }
                else{
                    place = 5;
                }
            }
            else if( sign.equals(board[2]) && comp.equals(board[9]) && sign.equals(board[6]) && comp.equals(board[7]) ){
                 if( sign.equals(board[8]) ){
                    place = 5;
                }
                else if( sign.equals(board[5]) ){
                    place = 8;
                }
                else{
                    place = 8;
                }
            }
            else if( sign.equals(board[8]) && comp.equals(board[1]) && sign.equals(board[2]) && comp.equals(board[5]) ){
                 if( sign.equals(board[7]) ){
                    place = 9;
                }
                else if( sign.equals(board[9]) ){
                    place = 7;
                }
                else{
                    place = 9;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[9]) && comp.equals(board[1]) ){
                 if( sign.equals(board[2]) ){
                    place = 4;
                }
                else if( sign.equals(board[4]) ){
                    place = 2;
                }
                else{
                    place= 4 ;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[1]) && comp.equals(board[9]) ){
                 if( sign.equals(board[8]) ){
                    place = 6;
                }
                else if( sign.equals(board[6]) ){
                    place = 8;
                }
                else{
                    place = 6;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[2]) && comp.equals(board[8]) ){
                 if( sign.equals(board[9]) ){
                    place = 1;
                }
                else{
                    place = 9;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[8]) && comp.equals(board[2]) ){
                 if( sign.equals(board[1]) ){
                    place = 9;
                }
                else{
                    place = 1;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[4]) && comp.equals(board[6]) ){
                 if( sign.equals(board[9]) ){
                    place = 1;
                }
                else{
                    place = 9;
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[6]) && comp.equals(board[4]) ){
                 if( sign.equals(board[1]) ){
                    place = 9;
                }
                else{
                    place = 1;
                }
            }
        }
        
        else if(n==9){
            if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[2]) && comp.equals(board[8]) ){
               if( sign.equals(board[9]) && comp.equals(board[1]) ){
                   if( sign.equals(board[4]) ){
                       place = 6;
                   }
                   else{
                       place = 4;
                   }
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[8]) && comp.equals(board[2]) ){
               if( sign.equals(board[1]) && comp.equals(board[9]) ){
                   if( sign.equals(board[6]) ){
                       place = 4;
                   }
                   else{
                       place = 6;
                   }
                }
            }
            else if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[4]) && comp.equals(board[6]) ){
               if( sign.equals(board[9]) && comp.equals(board[1]) ){
                   if( sign.equals(board[2]) ){
                       place = 8;
                   }
                   else{
                       place = 2;
                   }
                }
            }
            if( sign.equals(board[5]) && comp.equals(board[7]) && sign.equals(board[6]) && comp.equals(board[4]) ){
               if( sign.equals(board[1]) && comp.equals(board[9]) ){
                   if( sign.equals(board[8]) ){
                       place = 2;
                   }
                   else{
                       place = 8;
                   }
                }
            }
        }
        
        return place;
    }
    
    public static void place_marker(String [] board, String marker, int position){
     board[position]=marker;
    }
    
    public static boolean win_check(String [] board, String mark){
    
    return ((board[7] == mark && board[8] == mark && board[9] == mark) ||
    (board[4] == mark && board[5] == mark && board[6] == mark) ||
    (board[1] == mark && board[2] == mark && board[3] == mark) || 
    (board[7] == mark && board[4] == mark && board[1] == mark) ||
    (board[8] == mark && board[5] == mark && board[2] == mark) || 
    (board[9] == mark && board[6] == mark && board[3] == mark) || 
    (board[7] == mark && board[5] == mark && board[3] == mark) || 
    (board[9] == mark && board[5] == mark && board[1] == mark)); 
    }
    
    public static boolean full_board_check(String [] board){
     for(int i=1;i<10;i++){
        if (space_check(board, i)){
            return false;
                    }
    }
    return true;
    }
    
    public static void main(String[] args) {
      
        System.out.println("Lets play tic tac toe");
        System.out.println("Computer plays first and chooses X to play");
        
        String [] the_board=new String[10];
        for(int i=0;i<10;i++){
            the_board[i]=(" ");
        }
        
        boolean game=true;
        String computer="X";
        String player="O";
        String turn = "Computer";
        int mark_at=0;
        int rounds=1;
       
        while(game){
            
            if(turn.equalsIgnoreCase("Computer")){
            
               mark_at=computer_choice(the_board,rounds,player,computer);
               rounds+=1;
              
               place_marker(the_board, computer, mark_at);
               
               if (win_check(the_board, computer)){
                    display(the_board);
                    System.out.println("Computer has won the game!");
                    game = false;
                            }
               
               else{
                   
                if (full_board_check(the_board)){
                    display(the_board);
                    System.out.println("The game is a draw!");
                    break;
                         }
                                               
                else{
                    turn = "Player";
                    }
                      }
            }
            
            else{
                     
                display(the_board);
                
                
                mark_at = player_choice(the_board);
                rounds+=1;
                 
                
                place_marker(the_board, player, mark_at);

                if (win_check(the_board, player)){
                  display(the_board);
                  System.out.println("Congratulations! Player has won!");
                  game = false;
                }
                  else{
                    if (full_board_check(the_board)){
                    display(the_board);
                    System.out.println("The game is a draw!");
                    break;
                }
                    else{
                    turn = "Computer";
                          }
                          }
                          }
          
        }
    }
    
}

