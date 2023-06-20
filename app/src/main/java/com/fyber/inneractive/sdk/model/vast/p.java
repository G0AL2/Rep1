package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public String f17453a;

    /* renamed from: b  reason: collision with root package name */
    public String f17454b;

    public static p a(Node node) {
        if (node == null) {
            return null;
        }
        p pVar = new p();
        pVar.f17453a = x0.b(node, "event");
        pVar.f17454b = x0.a(node);
        return pVar;
    }

    public String toString() {
        return "VTracking:  name:" + this.f17453a + " url:" + this.f17454b;
    }
}
