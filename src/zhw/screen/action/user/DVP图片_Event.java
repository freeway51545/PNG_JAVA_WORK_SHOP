package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVPͼƬ;
public abstract class DVPͼƬ_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVPͼƬ(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_�Ŵ�(MSG_ZHW msg);
   public abstract void _F_��С(MSG_ZHW msg);
   public abstract void _F_��ת(MSG_ZHW msg);
   public abstract void _F_ѭ��(MSG_ZHW msg);
   public abstract void _F_�ظ�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_DVPͼƬ= 3043;
boolean IS_ST_DVPͼƬ(){ return ST_DVPͼƬ==STATE;}
final static int DVPͼƬ_����= 23970;
final static int DVPͼƬ_����_RELEASE=  23971;
final static int DVPͼƬ_����_PRESSING=  23972;
final static int  DVPͼƬ_����_PRESSED=  23973;
final static int  DVPͼƬ_����_ENTER=  23974;
final static int  DVPͼƬ_����_LEAVE=  23975;

final static int DVPͼƬ_��һ��= 23980;
final static int DVPͼƬ_��һ��_RELEASE=  23981;
final static int DVPͼƬ_��һ��_PRESSING=  23982;
final static int  DVPͼƬ_��һ��_PRESSED=  23983;
final static int  DVPͼƬ_��һ��_ENTER=  23984;
final static int  DVPͼƬ_��һ��_LEAVE=  23985;

final static int DVPͼƬ_��һ��= 23990;
final static int DVPͼƬ_��һ��_RELEASE=  23991;
final static int DVPͼƬ_��һ��_PRESSING=  23992;
final static int  DVPͼƬ_��һ��_PRESSED=  23993;
final static int  DVPͼƬ_��һ��_ENTER=  23994;
final static int  DVPͼƬ_��һ��_LEAVE=  23995;

final static int DVPͼƬ_�Ŵ�= 24000;
final static int DVPͼƬ_�Ŵ�_RELEASE=  24001;
final static int DVPͼƬ_�Ŵ�_PRESSING=  24002;
final static int  DVPͼƬ_�Ŵ�_PRESSED=  24003;
final static int  DVPͼƬ_�Ŵ�_ENTER=  24004;
final static int  DVPͼƬ_�Ŵ�_LEAVE=  24005;

final static int DVPͼƬ_��С= 24010;
final static int DVPͼƬ_��С_RELEASE=  24011;
final static int DVPͼƬ_��С_PRESSING=  24012;
final static int  DVPͼƬ_��С_PRESSED=  24013;
final static int  DVPͼƬ_��С_ENTER=  24014;
final static int  DVPͼƬ_��С_LEAVE=  24015;

final static int DVPͼƬ_��ת= 24020;
final static int DVPͼƬ_��ת_RELEASE=  24021;
final static int DVPͼƬ_��ת_PRESSING=  24022;
final static int  DVPͼƬ_��ת_PRESSED=  24023;
final static int  DVPͼƬ_��ת_ENTER=  24024;
final static int  DVPͼƬ_��ת_LEAVE=  24025;

final static int DVPͼƬ_ѭ��= 24030;
final static int DVPͼƬ_ѭ��_RELEASE=  24031;
final static int DVPͼƬ_ѭ��_PRESSING=  24032;
final static int  DVPͼƬ_ѭ��_PRESSED=  24033;
final static int  DVPͼƬ_ѭ��_ENTER=  24034;
final static int  DVPͼƬ_ѭ��_LEAVE=  24035;

final static int DVPͼƬ_�ظ�= 24040;
final static int DVPͼƬ_�ظ�_RELEASE=  24041;
final static int DVPͼƬ_�ظ�_PRESSING=  24042;
final static int  DVPͼƬ_�ظ�_PRESSED=  24043;
final static int  DVPͼƬ_�ظ�_ENTER=  24044;
final static int  DVPͼƬ_�ظ�_LEAVE=  24045;

final static int DVPͼƬ_�ر�= 24050;
final static int DVPͼƬ_�ر�_RELEASE=  24051;
final static int DVPͼƬ_�ر�_PRESSING=  24052;
final static int  DVPͼƬ_�ر�_PRESSED=  24053;
final static int  DVPͼƬ_�ر�_ENTER=  24054;
final static int  DVPͼƬ_�ر�_LEAVE=  24055;

final static int DVPͼƬ_�����б�= 24060;
final static int DVPͼƬ_�����б�_RELEASE=  24061;
final static int DVPͼƬ_�����б�_PRESSING=  24062;
final static int  DVPͼƬ_�����б�_PRESSED=  24063;
final static int  DVPͼƬ_�����б�_ENTER=  24064;
final static int  DVPͼƬ_�����б�_LEAVE=  24065;


public DVPͼƬ_Event() {
      actionMap.putInt("����",DVPͼƬ_����);
      actionMap.putInt("��һ��",DVPͼƬ_��һ��);
      actionMap.putInt("��һ��",DVPͼƬ_��һ��);
      actionMap.putInt("�Ŵ�",DVPͼƬ_�Ŵ�);
      actionMap.putInt("��С",DVPͼƬ_��С);
      actionMap.putInt("��ת",DVPͼƬ_��ת);
      actionMap.putInt("ѭ��",DVPͼƬ_ѭ��);
      actionMap.putInt("�ظ�",DVPͼƬ_�ظ�);
      actionMap.putInt("�ر�",DVPͼƬ_�ر�);
      actionMap.putInt("�����б�",DVPͼƬ_�����б�);
	STATE= changeState(STATE,ST_DVPͼƬ);
	setBindScreen(new Screen_DVPͼƬ(),SCRN_DVPͼƬ);
}

public String getScreenName(){
	return  "DVPͼƬ";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVPͼƬ){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVPͼƬ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_�Ŵ�_RELEASE){
				_F_�Ŵ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_��С_RELEASE){
				_F_��С(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_��ת_RELEASE){
				_F_��ת(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_ѭ��_RELEASE){
				_F_ѭ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_�ظ�_RELEASE){
				_F_�ظ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVPͼƬ_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
