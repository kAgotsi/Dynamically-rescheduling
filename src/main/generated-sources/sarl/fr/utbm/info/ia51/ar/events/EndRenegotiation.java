package fr.utbm.info.ia51.ar.events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author koffi Agbenya
 */
@SarlSpecification("0.8")
@SarlElementType(15)
public class EndRenegotiation extends Event {
  @SyntheticMember
  public EndRenegotiation() {
    super();
  }
  
  @SyntheticMember
  public EndRenegotiation(final Address source) {
    super(source);
  }
<<<<<<< HEAD
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
}
