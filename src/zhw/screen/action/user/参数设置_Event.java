package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������;
public abstract class ��������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_����DIR1(MSG_ZHW msg);
   public abstract void _F_����ѡ��(String a,MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_TIMMER_����(MSG_ZHW msg);
     final static int ST_����1_NORMAL= 3012;
boolean IS_ST_����1_NORMAL(){ return ST_����1_NORMAL==STATE;}
final static int ��������_��ʾ����= 21290;
final static int ��������_��ʾ����_RELEASE=  21291;
final static int ��������_��ʾ����_PRESSING=  21292;
final static int  ��������_��ʾ����_PRESSED=  21293;
final static int  ��������_��ʾ����_ENTER=  21294;
final static int  ��������_��ʾ����_LEAVE=  21295;

final static int ��������_��Ƶ����= 21300;
final static int ��������_��Ƶ����_RELEASE=  21301;
final static int ��������_��Ƶ����_PRESSING=  21302;
final static int  ��������_��Ƶ����_PRESSED=  21303;
final static int  ��������_��Ƶ����_ENTER=  21304;
final static int  ��������_��Ƶ����_LEAVE=  21305;

final static int ��������_ϵͳ����= 21310;
final static int ��������_ϵͳ����_RELEASE=  21311;
final static int ��������_ϵͳ����_PRESSING=  21312;
final static int  ��������_ϵͳ����_PRESSED=  21313;
final static int  ��������_ϵͳ����_ENTER=  21314;
final static int  ��������_ϵͳ����_LEAVE=  21315;

final static int ��������_����������= 21320;
final static int ��������_����������_RELEASE=  21321;
final static int ��������_����������_PRESSING=  21322;
final static int  ��������_����������_PRESSED=  21323;
final static int  ��������_����������_ENTER=  21324;
final static int  ��������_����������_LEAVE=  21325;

final static int ��������_��������= 21330;
final static int ��������_��������_RELEASE=  21331;
final static int ��������_��������_PRESSING=  21332;
final static int  ��������_��������_PRESSED=  21333;
final static int  ��������_��������_ENTER=  21334;
final static int  ��������_��������_LEAVE=  21335;

final static int ��������_·������= 21340;
final static int ��������_·������_RELEASE=  21341;
final static int ��������_·������_PRESSING=  21342;
final static int  ��������_·������_PRESSED=  21343;
final static int  ��������_·������_ENTER=  21344;
final static int  ��������_·������_LEAVE=  21345;

final static int ��������_�������˵�= 21350;
final static int ��������_�������˵�_RELEASE=  21351;
final static int ��������_�������˵�_PRESSING=  21352;
final static int  ��������_�������˵�_PRESSED=  21353;
final static int  ��������_�������˵�_ENTER=  21354;
final static int  ��������_�������˵�_LEAVE=  21355;

final static int ��������_ѡ��1= 21360;
final static int ��������_ѡ��1_RELEASE=  21361;
final static int ��������_ѡ��1_PRESSING=  21362;
final static int  ��������_ѡ��1_PRESSED=  21363;
final static int  ��������_ѡ��1_ENTER=  21364;
final static int  ��������_ѡ��1_LEAVE=  21365;

final static int ��������_��ҳ= 21370;
final static int ��������_��ҳ_RELEASE=  21371;
final static int ��������_��ҳ_PRESSING=  21372;
final static int  ��������_��ҳ_PRESSED=  21373;
final static int  ��������_��ҳ_ENTER=  21374;
final static int  ��������_��ҳ_LEAVE=  21375;

final static int ��������_��ҳ= 21380;
final static int ��������_��ҳ_RELEASE=  21381;
final static int ��������_��ҳ_PRESSING=  21382;
final static int  ��������_��ҳ_PRESSED=  21383;
final static int  ��������_��ҳ_ENTER=  21384;
final static int  ��������_��ҳ_LEAVE=  21385;


public ��������_Event() {
      actionMap.putInt("��ʾ����",��������_��ʾ����);
      actionMap.putInt("��Ƶ����",��������_��Ƶ����);
      actionMap.putInt("ϵͳ����",��������_ϵͳ����);
      actionMap.putInt("����������",��������_����������);
      actionMap.putInt("��������",��������_��������);
      actionMap.putInt("·������",��������_·������);
      actionMap.putInt("�������˵�",��������_�������˵�);
      actionMap.putInt("ѡ��1",��������_ѡ��1);
      actionMap.putInt("��ҳ",��������_��ҳ);
      actionMap.putInt("��ҳ",��������_��ҳ);
	STATE= changeState(STATE,ST_����1_NORMAL);
	setBindScreen(new Screen_��������(),SCRN_��������);
}

public String getScreenName(){
	return  "��������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����1_NORMAL){
			if(msg.wParam==��������_��ʾ����_RELEASE){
				TO_SCRN(SCRN_��ʾ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��Ƶ����_RELEASE){
				TO_SCRN(SCRN_��Ƶ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ϵͳ����_RELEASE){
				TO_SCRN(SCRN_ϵͳ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����������_RELEASE){
				TO_SCRN(SCRN_����������);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��������_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_����DIR1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_·������_RELEASE){
				TO_SCRN(SCRN_����_2);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�������˵�_RELEASE){
				TO_SCRN(getMainScreen());
				msg.setComsumered();
			}
			if(msg.wParam==��������_ѡ��1_RELEASE){
				_F_����ѡ��("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ѡ��1_RELEASE){
				_F_����ѡ��("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ѡ��1_RELEASE){
				_F_����ѡ��("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ѡ��1_RELEASE){
				_F_����ѡ��("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ѡ��1_RELEASE){
				_F_����ѡ��("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_����(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
