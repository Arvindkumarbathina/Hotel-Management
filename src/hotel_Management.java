import java.util.Scanner;
public class hotel_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std_room = 5;
        int del_room = 3;
        int suite = 2;
        int choice = 0;
        int room_det = 0;
        int total_night = 0;
        int room_cost = 0;
        int discount;
        int tax;
        while(choice!=5){
            System.out.println("==== HOTEL MENU ====");
            System.out.println("1.View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Calculate Bill");
            System.out.println("5. Exit");
            System.out.println();
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("====AVAILABLE ROOMS ====");
                    System.out.println("Standard Rooms: "+ std_room);
                    System.out.println("Deluxe Rooms: "+del_room);
                    System.out.println("Suite Rooms: "+suite);
                    break;
                case 2:
                    System.out.println("==== ROOM TYPES ====");
                    System.out.println("1. Standard - 1500/night\n2. Deluxe - 2500/night\nSuite - 4000/night");
                    System.out.println();
                    System.out.println("Enter room type: ");
                    int room = sc.nextInt();
                    room_det=room;
                    System.out.println("Enter number of nights: ");
                    int total_days = sc.nextInt();
                    total_night = total_days;
                    switch(room){
                        case 1:
                            if(std_room!=0) {
                                System.out.println("Room booked Successfully.\nRoom Type: Standard\nNights " + total_days);
                                std_room = std_room - 1;

                            }
                            else {
                                System.out.println("Room not available.");
                            }
                            break;
                        case 2:
                            if(del_room!=0) {
                                System.out.println("Room booked Successfully.\nRoom Type: Deluxe\nNights " + total_days);
                                del_room = del_room - 1;
                            }
                            else{
                                System.out.println("Room not available.");
                            }
                            break;
                        case 3:
                            if(suite!=0) {
                                System.out.println("Room booked Successfully.\nRoom Type: Suite\nNights " + total_days);
                                suite = suite-1;
                            }
                            else{
                                System.out.println("Room not available.");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the type of room that you want to cancel the booking");
                    System.out.println("1. Standard Room\n2. Deluxe Room\n3. Suite");
                    int cancel_room = sc.nextInt();
                    switch(cancel_room){
                        case 1:
                            System.out.println("Your booking has been canceled.");
                            std_room = std_room+1;
                            break;
                        case 2:
                            System.out.println("Your booking has been canceled.");
                            del_room = del_room+1;
                            break;
                        case 3:
                            System.out.println("Your booking has been canceled.");
                            suite = suite+1;
                            break;
                    }
                    break;
                case 4:
                    System.out.println("==== CALCULATE BILL =====");
                    System.out.println("Room type: "+ room_det);
                    System.out.println("Total number of nights: "+total_night);

                    if(room_det==1){
                        System.out.println("Room Price: 1500/night");
                        System.out.println("Number of night: "+total_night);
                        room_cost = 1500*total_night;
                        System.out.println("Room Cost: "+ room_cost);
                    }
                    else if(room_det==2){
                        System.out.println("Room Price: 2500/night");
                        System.out.println("Number of night: "+total_night);
                        room_cost = 2500*total_night;
                        System.out.println("Room Cost: "+ room_cost);
                    }
                    else if(room_det==3){
                        System.out.println("Room Price: 4000/night");
                        System.out.println("Number of night: "+total_night);
                        room_cost = 4000*total_night;
                        System.out.println("Room Cost: "+ room_cost);
                    }
                    discount = (room_cost*10)/100;
                    System.out.println("Discount(10%): "+discount);
                    room_cost = room_cost-discount;
                    System.out.println("Amount After Discount: "+room_cost);
                    tax = (room_cost*5)/100;
                    System.out.println("Tax (5%) :"+ tax);
                    room_cost = room_cost+tax;
                    System.out.println("----------------------");
                    System.out.println("Final price: " + room_cost);
                    break;
            }
        }
    }
}
