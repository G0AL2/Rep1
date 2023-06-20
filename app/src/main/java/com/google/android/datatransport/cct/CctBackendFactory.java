package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.f;
import x7.g;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements x7.a {
    @Override // x7.a
    public g create(f fVar) {
        return new d(fVar.b(), fVar.e(), fVar.d());
    }
}
