package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.a;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public Integer f17410a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f17411b;

    /* renamed from: c  reason: collision with root package name */
    public String f17412c;

    /* renamed from: d  reason: collision with root package name */
    public i f17413d;

    /* renamed from: e  reason: collision with root package name */
    public String f17414e;

    /* renamed from: f  reason: collision with root package name */
    public String f17415f;

    /* renamed from: g  reason: collision with root package name */
    public String f17416g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f17417h;

    /* renamed from: i  reason: collision with root package name */
    public a.C0235a f17418i;

    /* renamed from: j  reason: collision with root package name */
    public List<p> f17419j;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Companion: ");
        sb2.append(" w:");
        sb2.append(this.f17410a);
        sb2.append(" h:");
        sb2.append(this.f17411b);
        sb2.append(" ctr:");
        sb2.append(this.f17416g);
        sb2.append(" clt:");
        sb2.append(this.f17417h);
        if (!TextUtils.isEmpty(this.f17415f)) {
            sb2.append(" html:");
            sb2.append(this.f17415f);
        }
        if (this.f17413d != null) {
            sb2.append(" static:");
            sb2.append(this.f17413d.f17429b);
            sb2.append("creative:");
            sb2.append(this.f17413d.f17428a);
        }
        if (!TextUtils.isEmpty(this.f17414e)) {
            sb2.append(" iframe:");
            sb2.append(this.f17414e);
        }
        sb2.append(" events:");
        sb2.append(this.f17419j);
        if (this.f17418i != null) {
            sb2.append(" reason:");
            sb2.append(this.f17418i.f17307a);
        }
        return sb2.toString();
    }
}
