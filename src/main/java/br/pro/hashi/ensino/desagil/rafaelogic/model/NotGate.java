package br.pro.hashi.ensino.desagil.rafaelogic.model;

public class NotGate extends Gate{
	
	private NandGate nandGate;
	
	public NotGate() {
		super("NOT");
		this.size=1;
		nandGate = new NandGate();
	}
	
	@Override
	public void connect(int pinIndex, Emitter emitter) {
		nandGate.connect(0, emitter);
		nandGate.connect(1, emitter);
	}

	@Override
	public boolean read() {
		return nandGate.read();
	}


}
