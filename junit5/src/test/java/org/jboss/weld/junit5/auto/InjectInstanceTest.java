package org.jboss.weld.junit5.auto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

import org.jboss.weld.junit5.auto.classes.Bar;
import org.jboss.weld.junit5.auto.classes.Baz;
import org.jboss.weld.junit5.auto.classes.Foo;
import org.junit.jupiter.api.Test;

@EnableAutoWeld
public class InjectInstanceTest {

    @Inject
    Instance<Foo> fooInstance;

    @Test
    void test() {
        assertNotNull(fooInstance.select(Bar.class).get());
        assertNotNull(fooInstance.select(Baz.class).get());
    }

}
