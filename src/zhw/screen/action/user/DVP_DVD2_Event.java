package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_DVD2;
public abstract class DVP_DVD2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_DVD2(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_�Ŵ�(MSG_ZHW msg);
   public abstract void _F_��С(MSG_ZHW msg);
   public abstract void _F_MENU(MSG_ZHW msg);
   public abstract void _F_TITLE(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_DVP_DVD2= 3047;
boolean IS_ST_DVP_DVD2(){ return ST_DVP_DVD2==STATE;}
final static int DVP_DVD2_�Ŵ�= 24360;
final static int DVP_DVD2_�Ŵ�_RELEASE=  24361;
final static int DVP_DVD2_�Ŵ�_PRESSING=  24362;
final static int  DVP_DVD2_�Ŵ�_PRESSED=  24363;
final static int  DVP_DVD2_�Ŵ�_ENTER=  24364;
final static int  DVP_DVD2_�Ŵ�_LEAVE=  24365;

final static int DVP_DVD2_��С= 24370;
final static int DVP_DVD2_��С_RELEASE=  24371;
final static int DVP_DVD2_��С_PRESSING=  24372;
final static int  DVP_DVD2_��С_PRESSED=  24373;
final static int  DVP_DVD2_��С_ENTER=  24374;
final static int  DVP_DVD2_��С_LEAVE=  24375;

final static int DVP_DVD2_MENU= 24380;
final static int DVP_DVD2_MENU_RELEASE=  24381;
final static int DVP_DVD2_MENU_PRESSING=  24382;
final static int  DVP_DVD2_MENU_PRESSED=  24383;
final static int  DVP_DVD2_MENU_ENTER=  24384;
final static int  DVP_DVD2_MENU_LEAVE=  24385;

final static int DVP_DVD2_TITLE= 24390;
final static int DVP_DVD2_TITLE_RELEASE=  24391;
final static int DVP_DVD2_TITLE_PRESSING=  24392;
final static int  DVP_DVD2_TITLE_PRESSED=  24393;
final static int  DVP_DVD2_TITLE_ENTER=  24394;
final static int  DVP_DVD2_TITLE_LEAVE=  24395;

final static int DVP_DVD2_����= 24400;
final static int DVP_DVD2_����_RELEASE=  24401;
final static int DVP_DVD2_����_PRESSING=  24402;
final static int  DVP_DVD2_����_PRESSED=  24403;
final static int  DVP_DVD2_����_ENTER=  24404;
final static int  DVP_DVD2_����_LEAVE=  24405;

final static int DVP_DVD2_����= 24410;
final static int DVP_DVD2_����_RELEASE=  24411;
final static int DVP_DVD2_����_PRESSING=  24412;
final static int  DVP_DVD2_����_PRESSED=  24413;
final static int  DVP_DVD2_����_ENTER=  24414;
final static int  DVP_DVD2_����_LEAVE=  24415;

final static int DVP_DVD2_��һҳ= 24420;
final static int DVP_DVD2_��һҳ_RELEASE=  24421;
final static int DVP_DVD2_��һҳ_PRESSING=  24422;
final static int  DVP_DVD2_��һҳ_PRESSED=  24423;
final static int  DVP_DVD2_��һҳ_ENTER=  24424;
final static int  DVP_DVD2_��һҳ_LEAVE=  24425;

final static int DVP_DVD2_�ر�= 24430;
final static int DVP_DVD2_�ر�_RELEASE=  24431;
final static int DVP_DVD2_�ر�_PRESSING=  24432;
final static int  DVP_DVD2_�ر�_PRESSED=  24433;
final static int  DVP_DVD2_�ر�_ENTER=  24434;
final static int  DVP_DVD2_�ر�_LEAVE=  24435;

final static int DVP_DVD2_��= 24440;
final static int DVP_DVD2_��_RELEASE=  24441;
final static int DVP_DVD2_��_PRESSING=  24442;
final static int  DVP_DVD2_��_PRESSED=  24443;
final static int  DVP_DVD2_��_ENTER=  24444;
final static int  DVP_DVD2_��_LEAVE=  24445;

final static int DVP_DVD2_��= 24450;
final static int DVP_DVD2_��_RELEASE=  24451;
final static int DVP_DVD2_��_PRESSING=  24452;
final static int  DVP_DVD2_��_PRESSED=  24453;
final static int  DVP_DVD2_��_ENTER=  24454;
final static int  DVP_DVD2_��_LEAVE=  24455;

final static int DVP_DVD2_��= 24460;
final static int DVP_DVD2_��_RELEASE=  24461;
final static int DVP_DVD2_��_PRESSING=  24462;
final static int  DVP_DVD2_��_PRESSED=  24463;
final static int  DVP_DVD2_��_ENTER=  24464;
final static int  DVP_DVD2_��_LEAVE=  24465;

final static int DVP_DVD2_��= 24470;
final static int DVP_DVD2_��_RELEASE=  24471;
final static int DVP_DVD2_��_PRESSING=  24472;
final static int  DVP_DVD2_��_PRESSED=  24473;
final static int  DVP_DVD2_��_ENTER=  24474;
final static int  DVP_DVD2_��_LEAVE=  24475;

final static int DVP_DVD2_OK= 24480;
final static int DVP_DVD2_OK_RELEASE=  24481;
final static int DVP_DVD2_OK_PRESSING=  24482;
final static int  DVP_DVD2_OK_PRESSED=  24483;
final static int  DVP_DVD2_OK_ENTER=  24484;
final static int  DVP_DVD2_OK_LEAVE=  24485;

final static int DVP_DVD2_�����淵��= 24490;
final static int DVP_DVD2_�����淵��_RELEASE=  24491;
final static int DVP_DVD2_�����淵��_PRESSING=  24492;
final static int  DVP_DVD2_�����淵��_PRESSED=  24493;
final static int  DVP_DVD2_�����淵��_ENTER=  24494;
final static int  DVP_DVD2_�����淵��_LEAVE=  24495;

final static int DVP_DVD2_�����б�= 24500;
final static int DVP_DVD2_�����б�_RELEASE=  24501;
final static int DVP_DVD2_�����б�_PRESSING=  24502;
final static int  DVP_DVD2_�����б�_PRESSED=  24503;
final static int  DVP_DVD2_�����б�_ENTER=  24504;
final static int  DVP_DVD2_�����б�_LEAVE=  24505;


public DVP_DVD2_Event() {
      actionMap.putInt("�Ŵ�",DVP_DVD2_�Ŵ�);
      actionMap.putInt("��С",DVP_DVD2_��С);
      actionMap.putInt("MENU",DVP_DVD2_MENU);
      actionMap.putInt("TITLE",DVP_DVD2_TITLE);
      actionMap.putInt("����",DVP_DVD2_����);
      actionMap.putInt("����",DVP_DVD2_����);
      actionMap.putInt("��һҳ",DVP_DVD2_��һҳ);
      actionMap.putInt("�ر�",DVP_DVD2_�ر�);
      actionMap.putInt("��",DVP_DVD2_��);
      actionMap.putInt("��",DVP_DVD2_��);
      actionMap.putInt("��",DVP_DVD2_��);
      actionMap.putInt("��",DVP_DVD2_��);
      actionMap.putInt("OK",DVP_DVD2_OK);
      actionMap.putInt("�����淵��",DVP_DVD2_�����淵��);
      actionMap.putInt("�����б�",DVP_DVD2_�����б�);
	STATE= changeState(STATE,ST_DVP_DVD2);
	setBindScreen(new Screen_DVP_DVD2(),SCRN_DVP_DVD2);
}

public String getScreenName(){
	return  "DVP_DVD2";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_DVD2){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_DVD2(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_�Ŵ�_RELEASE){
				_F_�Ŵ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��С_RELEASE){
				_F_��С(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_MENU_RELEASE){
				_F_MENU(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_TITLE_RELEASE){
				_F_TITLE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_OK_RELEASE){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
