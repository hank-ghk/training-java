package DesignPattern24.cbf4life.mediator2;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator _mediator) {
		this.mediator = _mediator;
	}
}