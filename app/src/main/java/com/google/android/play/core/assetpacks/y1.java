package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: b  reason: collision with root package name */
    private static final cb.e f23105b = new cb.e("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(a0 a0Var) {
        this.f23106a = a0Var;
    }

    private static void b(File file, File file2) {
        File[] listFiles;
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 51);
                sb2.append("File clashing with existing file from other slice: ");
                sb2.append(valueOf);
                throw new s0(sb2.toString());
            } else if (file.renameTo(file2)) {
                return;
            } else {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 21);
                sb3.append("Unable to move file: ");
                sb3.append(valueOf2);
                throw new s0(sb3.toString());
            }
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 28);
        sb4.append("Unable to delete directory: ");
        sb4.append(valueOf3);
        throw new s0(sb4.toString());
    }

    public final void a(x1 x1Var) {
        File k10 = this.f23106a.k(x1Var.f22914b, x1Var.f23097c, x1Var.f23098d, x1Var.f23099e);
        if (!k10.exists()) {
            throw new s0(String.format("Cannot find verified files for slice %s.", x1Var.f23099e), x1Var.f22913a);
        }
        File m10 = this.f23106a.m(x1Var.f22914b, x1Var.f23097c, x1Var.f23098d);
        if (!m10.exists()) {
            m10.mkdirs();
        }
        b(k10, m10);
        try {
            this.f23106a.f(x1Var.f22914b, x1Var.f23097c, x1Var.f23098d, this.f23106a.r(x1Var.f22914b, x1Var.f23097c, x1Var.f23098d) + 1);
        } catch (IOException e10) {
            f23105b.e("Writing merge checkpoint failed with %s.", e10.getMessage());
            throw new s0("Writing merge checkpoint failed.", e10, x1Var.f22913a);
        }
    }
}
