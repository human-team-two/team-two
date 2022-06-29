package Monster;

public class Monster{

    public String name;
    public int hp;
    public int mp;
    public int amor;



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
    // 몬스터 피해
    public void dmg(int dmg){
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은" + dmg + " 공격을 받았습니다." );
    }
    // 몬스터 공격
    public int att(){
        System.out.println(this.name + "은" + 10 + "공격을 했다." );
        return 10;
    }

    // 몬스터가 생사 확인
    public void die() {
        if (hp <= 0) {
            hp = 0;
            System.out.println(this.Name + "이/가 죽었습니다.");
        } else {
            System.out.println(this.Name + "이/가 살아있습니다.");
        }
    }

    // 몬스터 수치 랜덤 생성
    void create() {
        String[] Monster_color = new String[4];

        Monster_color[0] = "흰색 " + name;
        Monster_color[1] = "검은색 " + name;
        Monster_color[2] = "붉은색 " + name;
        Monster_color[3] = "파란색 " + name;

        Random cr_ran = new Random();
        int cr_rand = (int) (Math.random() * Monster_color.length - 1);
        this.Name = Monster_color[cr_rand];
        this.hp = (int) (Math.random() * 50) + 1;
        this.mp = (int) (Math.random() * 50) + 1;
        this.amor = (int) (Math.random() * 10) + 1;

        Monster(this.name, this.hp, this.mp, this.amor);

    }

    

}