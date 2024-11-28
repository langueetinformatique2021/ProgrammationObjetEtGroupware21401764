package atelier06;

public class testChat {
	
	public static void main(String[] args) {
        Chat c = new Chat("Abyssins");
        c.présente();
    	c.crie();
    	
    }
}   	
	
	
	
	
	
    /** point d'entrée d'un exécutable */
   // public static void main(String[] args) {
        // 创建一个 Chat 对象
    //    Chat chat = new Chat("domestique");

        // 测试 présente 方法（继承自 Felin）
      //  chat.présente();

        // 测试 crie 方法（继承自 Felin 或重写）
      //  chat.crie();

        // 测试 domestiquer 方法
     //   chat.domestiquer("Minou");
    //    System.out.println("Nom du chat après domestication : " + chat.nom());
    }
}

