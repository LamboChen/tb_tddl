/*(C) 2007-2012 Alibaba Group Holding Limited.	

public class CantFindTargetTabRuleTypeException extends TDLRunTimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7179888759169646552L;
	public CantFindTargetTabRuleTypeException(String msg) {
		super("�޷����������tableRule:"+msg+"�ҵ���Ӧ�Ĵ���������");
	}
}