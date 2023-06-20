package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x0;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class s extends e {

    /* renamed from: e  reason: collision with root package name */
    public String f17479e;

    public static s c(Node node) {
        s sVar = new s();
        super.b(node);
        sVar.f17479e = x0.a(x0.d(node, "VASTAdTagURI"));
        return sVar;
    }
}
