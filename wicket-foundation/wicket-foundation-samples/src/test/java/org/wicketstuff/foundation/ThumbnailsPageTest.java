package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.ThumbnailsPage;

public class ThumbnailsPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(ThumbnailsPage.class);
		tester.assertRenderedPage(ThumbnailsPage.class);
	}
}
