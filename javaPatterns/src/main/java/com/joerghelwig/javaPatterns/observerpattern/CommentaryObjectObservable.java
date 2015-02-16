package com.joerghelwig.javaPatterns.observerpattern;

import java.util.Observable;

/**
 * Java has built-in support for the Observer Pattern. The most general is the Observer interface and the Observable class in the java.util package.
 *  These are quite similar to our Subject and Observer interface, but give you a lot of functionality out of the box.
 *  
 *  This time we extends the Observable class to make our class as a subject and please note that the above class does not hold any reference to the observers, 
 *  it is handled by the parent class, that’s is, the Observable class. However, we declared the setDesc method to change the state of the object, as done in the previous example. 
 *  The setChanged method is the method from the upper class which is used to set the changed flag to true. The notifyObservers method notifies 
 *  all of its observers and then calls the clearChanged method to indicate that this object has no longer changed. Each observer has its update method called with two arguments:
 *   an observable object and the arg argument.
 * 
 * @author Joerg
 *
 */
public class CommentaryObjectObservable extends Observable implements Commentary {
	private String desc;
	private final String subjectDetails;

	public CommentaryObjectObservable(String subjectDetails){
		this.subjectDetails = subjectDetails;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
		setChanged();
		notifyObservers(desc);
	}
	
	public String subjectDetails() {
		return subjectDetails;
	}
}
