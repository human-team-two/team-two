package Monster_In;

import Items.Items;
import Items.Sword;
import Items.Wand;

import java.util.ArrayList;

public class GorilaM implements  Monster{
    public String name;
    public int hp;
    public int amor;

    public GorilaM(String name, int hp, int amor) {
        this.name = name;
        this.hp = hp;
        this.amor = amor;

    }

    @Override
    public void showInfo() {
        System.out.println("몬스터 : " + this.name);
        System.out.println("현재 체력 : " + this.hp);
        System.out.println("방어력 : " + this.amor);
    }

    @Override
    public int hit() {
        double random = Math.random();
        //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
        int intValue = (int) (random * 101) + 50;
        if (intValue > 60) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }

        return intValue;
    }


    @Override
    public void dmg(int dmg) {
        int am_dm = this.amor - dmg;
        if(amor > dmg){

            System.out.println(this.name + "은 " + "miss");
        }else if (dmg > amor){
            this.hp = this.hp - Math.abs(am_dm);
            System.out.println(this.name + "은 " + Math.abs(am_dm) + "의 공격을 받았습니다. ");
        }
    }

    @Override
    public void drop() {
        Items item_S = new Sword("검", 10, "전사");
        Items item_W = new Wand("지팡이", 10, "마법사");

    }


    @Override
    public void create() { //여러 색깔을 가진 고릴라
        ArrayList<String> name_G = new ArrayList<>();
        name_G.add("고릴라");
        name_G.add("노란 고릴라");
        name_G.add("빨간 고릴라");
        name_G.add("파랑 고릴라");
        name_G.add("초록 고릴라");
        name_G.add("검은 고릴라");
        System.out.println("어떤식으로 들어감? : "+name_G);
        int index_G = (int)(Math.random() * (name_G.size()-1));
        GorilaM gorilaM = new GorilaM(name_G.get(index_G), 500, 100);
        gorilaM.showInfo();
    }





    public static void main(String[] args){
        GorilaM gorila = new GorilaM("고릴라" , 500, 100);
        gorila.create();


    }
}
