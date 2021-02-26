package com.company;

public class playerlinked {
    private playernode head;

    public void addtofront(Player player){
        playernode PlayerNode = new playernode(player);
        PlayerNode.setNextplayer(head);
        head = PlayerNode;
    }
    public void printit(){
        playernode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextplayer();
        }
        System.out.print("null");
    }
}
