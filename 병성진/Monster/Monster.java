package 병성진.Monster;

public class Monster{

    public String name;
    public int hp;
    public int mp;
    public int amor;


    //평범한 슬라임일 때
    public Monster(){
        this.name = "슬라임";
        this.hp = 10;
        this.mp = 0;
        this.amor = 0;
    }

    //몬스터 랜덤
    public Monster(String name_Ra){
        this.name = name_Ra;
    }


    //그냥 일반 몬스터
    public Monster(String name, int hp, int mp,int amor){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.amor = amor;


    }
    //몬스터 상태창 
    public void showInfo(){
        System.out.println("_______" + this.name + "_______");
        System.out.println("HP : "  + this.hp);
        System.out.println("MP : "  + this.mp);
        System.out.println("AMOR : "  + this.amor);

    }

    public void dmg(int dmg){
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은" + dmg + " 공격을 받았습니다." );
    }

    public int att(){
        System.out.println(this.name + "은" + 10 + "공격을 했다." );
        return 10;
    }

    public void aa(){
        
    }

    

}