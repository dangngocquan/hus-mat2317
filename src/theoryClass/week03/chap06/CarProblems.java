package theoryClass.week03.chap06;

import java.util.Scanner;

//Exercise 6.9
public class CarProblems {
	static boolean isValidChoice(String choice) {
		if (choice.equals("y") || choice.equals("n")) {
			return true;
		}else {
			System.out.println();
			System.out.println("Your choice is invalid. Please try again !");
			System.out.println();
			return false;
		}
	}
	
	public static void main(String[] args) {
		//Create data
		Node node1 = new Node("Get it in for service.");
		Node node2 = new Node("Check to ensure the choke is opening and closing.");
		Node node3 = new Node("Does your car have fuel injection? (y/n) ",node1,node2);
		Node node4 = new Node("Does the engine start and then die?",node3,null);
		Node node5 = new Node("Check spark plug connections.");
		Node node6 = new Node("Does the car crank up but fail to start? (y/n) ",node5,node4);
		Node node7 = new Node("Replace the battery.");
		Node node8 = new Node("Does the car make a clicking noise? (y/n) ", node7, node6);
		Node node9 = new Node("Replace cables and try again.");
		Node node10 = new Node("Clean terminals and try starting again.");
		Node node11 = new Node("Are the battery terminals corroded? (y/n) ", node10, node9);
		Node node12 = new Node("Is the car silent when you turn the key? (y/n) ", node11, node8);
		
		//Input + Output
		Scanner scanner = new Scanner(System.in);
		Node node = node12;
		while (node != null) {
			if (node.yesNode != null && node.noNode != null) {
				String choice = "";
				do {
					System.out.print(node.data);
					choice = scanner.nextLine().toLowerCase();
				} while (!isValidChoice(choice));
				if (choice.equals("y")) {
					node = node.yesNode;
				}else {
					node = node.noNode;
				}
			}else if (node.yesNode != null){
				System.out.println(node.data);
				node = node.yesNode;
			}else if (node.noNode != null) {
				System.out.println(node.data);
				node = node.noNode;
			}else {
				System.out.println(node.data);
				node = null;
			}
		}
		scanner.close();
	}
}

class Node {
	String data = null;
	Node yesNode = null;
	Node noNode = null;
	
	Node(String data1) {
		this.data = data1;
	}
	
	Node(String data1, Node yesNode1, Node noNode1) {
		this.data = data1;
		this.yesNode = yesNode1;
		this.noNode = noNode1;
	}
}
