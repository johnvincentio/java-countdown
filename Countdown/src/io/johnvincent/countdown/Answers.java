
package io.johnvincent.countdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Answers {
	private List<Answer> m_list = new ArrayList<Answer>();

	public void add (Answer item) {m_list.add(item);}
	public Iterator<Answer> getAnswers() {return m_list.iterator();}
	public int getSize() {return m_list.size();}
}
