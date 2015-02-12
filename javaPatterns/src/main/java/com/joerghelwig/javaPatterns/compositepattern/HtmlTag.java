package com.joerghelwig.javaPatterns.compositepattern;

import java.util.List;

/**
 * The HtmlTag class is the component class which defines all the methods used by the composite and the leaf class.
 *  There are some methods which should be common in both the extended classes; 
 *  hence these methods are kept abstract in the above class, to enforce their implementation in the child classes.

The getTagName(), just returns the tag name and should be used by both child classes, i.e.,
 the composite class and the leaf class.

Every html element should have a start tag and an end tag, the methods setStartTag and setEndTag 
are used to set the start and end tag of an html element and should be implemented by both the child classes, 
so they are kept abstract in the above class.

There are methods which are useful only to the composite class and are useless to the leaf class. 
Just provide the default implementation to these methods, 
throwing an exception is a good implementation of these methods to avoid any accidental call to these methods by
 the object which should not support them.

The generatHtml() method is the operation which should support by both the extended classes.
 For the simplicity, it just prints the tag to the console.
 
 * @author Joerg
 *
 */

public abstract class HtmlTag {
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void addChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public void removeChildTag(HtmlTag htmlTag){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public List<HtmlTag>getChildren(){
		throw new UnsupportedOperationException("Current operation is not support for this object");
	}
	public abstract void generateHtml();

}
