package com.fyber.inneractive.sdk.external;

/* loaded from: classes.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a  reason: collision with root package name */
    public final InneractiveErrorCode f17163a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable f17164b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.f17163a = inneractiveErrorCode;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.f17163a;
        if (inneractiveErrorCode != null) {
            sb2.append(inneractiveErrorCode);
        }
        if (this.f17164b != null) {
            sb2.append(": ");
            sb2.append(this.f17164b);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        return this.f17164b;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f17163a;
    }

    public void setCause(Throwable th) {
        this.f17164b = th;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.f17164b = th;
    }
}
