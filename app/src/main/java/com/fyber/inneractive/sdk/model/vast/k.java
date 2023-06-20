package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class k extends e {
    public static k c(Node node) {
        k kVar = new k();
        super.b(node);
        x0.a(x0.d(node, "AdTitle"));
        x0.a(x0.d(node, "Description"));
        return kVar;
    }
}
