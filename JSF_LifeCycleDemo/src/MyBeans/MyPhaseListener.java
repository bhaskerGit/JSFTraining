package MyBeans;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener{

	@Override
	public void afterPhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("After "+arg0.getSource()+" : "+arg0.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before "+arg0.getSource()+" : "+arg0.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

	
}
