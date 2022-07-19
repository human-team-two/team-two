package Monster_In;

import java.util.ArrayList;

public class TigerM implements Monster{
    public String name;
    public int hp;
    public int amor;

    public TigerM(String name, int hp, int amor) {
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

    }

    @Override
    public void create() { //여러 색깔을 가진 고릴라
        ArrayList<String> name_T = new ArrayList<>();
        name_T.add("호랑이");
        name_T.add("노란 호랑이");
        name_T.add("빨간 호랑이");
        name_T.add("파랑 호랑이");
        name_T.add("초록 호랑이");
        name_T.add("검은 호랑이");
        int index_T = (int)(Math.random() * (name_T.size()-1));
        TigerM tigerM = new TigerM(name_T.get(index_T), 1000, 150);
        tigerM.showInfo();
    }





    public static void main(String[] args){
        TigerM tigerM = new TigerM("호랑이", 1000, 150);
        tigerM.create();


    }
}