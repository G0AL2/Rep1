package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: b  reason: collision with root package name */
    private static final cb.e f22958b = new cb.e("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22959a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(a0 a0Var) {
        this.f22959a = a0Var;
    }

    private final void b(n2 n2Var, File file) {
        try {
            File y10 = this.f22959a.y(n2Var.f22914b, n2Var.f22922c, n2Var.f22923d, n2Var.f22924e);
            if (!y10.exists()) {
                throw new s0(String.format("Cannot find metadata files for slice %s.", n2Var.f22924e), n2Var.f22913a);
            }
            try {
                if (!u1.a(m2.a(file, y10)).equals(n2Var.f22925f)) {
                    throw new s0(String.format("Verification failed for slice %s.", n2Var.f22924e), n2Var.f22913a);
                }
                f22958b.f("Verification of slice %s of pack %s successful.", n2Var.f22924e, n2Var.f22914b);
            } catch (IOException e10) {
                throw new s0(String.format("Could not digest file during verification for slice %s.", n2Var.f22924e), e10, n2Var.f22913a);
            } catch (NoSuchAlgorithmException e11) {
                throw new s0("SHA256 algorithm not supported.", e11, n2Var.f22913a);
            }
        } catch (IOException e12) {
            throw new s0(String.format("Could not reconstruct slice archive during verification for slice %s.", n2Var.f22924e), e12, n2Var.f22913a);
        }
    }

    public final void a(n2 n2Var) {
        File c10 = this.f22959a.c(n2Var.f22914b, n2Var.f22922c, n2Var.f22923d, n2Var.f22924e);
        if (!c10.exists()) {
            throw new s0(String.format("Cannot find unverified files for slice %s.", n2Var.f22924e), n2Var.f22913a);
        }
        b(n2Var, c10);
        File k10 = this.f22959a.k(n2Var.f22914b, n2Var.f22922c, n2Var.f22923d, n2Var.f22924e);
        if (!k10.exists()) {
            k10.mkdirs();
        }
        if (!c10.renameTo(k10)) {
            throw new s0(String.format("Failed to move slice %s after verification.", n2Var.f22924e), n2Var.f22913a);
        }
    }
}
