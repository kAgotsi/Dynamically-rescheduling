package fr.utbm.info.ia51.ar.ui;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * ** Request for refreshing the JavaFX screen.
 */
@SarlSpecification("0.8")
@SarlElementType(15)
public class Refresh extends Event {
  @SyntheticMember
  public Refresh() {
    super();
  }
  
  @SyntheticMember
  public Refresh(final Address source) {
    super(source);
  }
<<<<<<< HEAD
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
=======
>>>>>>> a964ccd9ac12f65bb890ba9dff4d4bace10f9fbb
}
