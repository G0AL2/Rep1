package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final f f6615b = new f() { // from class: com.apm.insight.runtime.f.1

        /* renamed from: a  reason: collision with root package name */
        Header f6617a = null;

        @Override // com.apm.insight.runtime.f
        public Object b(String str) {
            if (this.f6617a == null) {
                this.f6617a = Header.b(com.apm.insight.h.g());
            }
            return this.f6617a.f().opt(str);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private f f6616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        this(f6615b);
    }

    f(f fVar) {
        this.f6616a = null;
        this.f6616a = fVar;
    }

    public Object a(String str) {
        f fVar = this.f6616a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        f fVar = this.f6616a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }
}
