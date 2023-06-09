package DesignPattern24.cbf4life.mediator.advance;

public abstract class AbstractColleague {
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
