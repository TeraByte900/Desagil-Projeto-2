package br.pro.hashi.ensino.desagil.rafaelogic.model;

public class XorGate extends Gate{

	private NandGate nandGate1;
	private NandGate nandGate2;
	private NandGate nandGate3;
	private NandGate nandGate4;

	public XorGate() {
		super("XOR");
		
		nandGate1 = new NandGate();
		nandGate2 = new NandGate();
		nandGate3 = new NandGate();
		nandGate4 = new NandGate();
		
		nandGate2.connect(1, nandGate1);
		nandGate3.connect(1, nandGate1);
		nandGate4.connect(0, nandGate2);
		nandGate4.connect(1, nandGate3);

	}
	
	@Override
	public void connect(int pinIndex, Emitter emitter) {
		if(pinIndex == 0){
			nandGate1.connect(0, emitter);
			nandGate2.connect(0, emitter);
		}
		if(pinIndex == 1){
			nandGate1.connect(1, emitter);
			nandGate3.connect(0, emitter);
		}
	}
	
	@Override
	public boolean read() {
		
		return nandGate4.read();
	}
	
	
}
