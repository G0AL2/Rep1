package g2;

import android.graphics.Color;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public class o implements n0<d2.d> {

    /* renamed from: a  reason: collision with root package name */
    private int f30506a;

    public o(int i10) {
        this.f30506a = i10;
    }

    private d2.d b(d2.d dVar, List<Float> list) {
        int i10 = this.f30506a * 4;
        if (list.size() <= i10) {
            return dVar;
        }
        float[] b10 = dVar.b();
        int[] a10 = dVar.a();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        int i12 = this.f30506a + size;
        float[] fArr3 = new float[i12];
        int[] iArr = new int[i12];
        System.arraycopy(dVar.b(), 0, fArr3, 0, this.f30506a);
        System.arraycopy(fArr, 0, fArr3, this.f30506a, size);
        Arrays.sort(fArr3);
        for (int i13 = 0; i13 < i12; i13++) {
            float f10 = fArr3[i13];
            int binarySearch = Arrays.binarySearch(b10, f10);
            int binarySearch2 = Arrays.binarySearch(fArr, f10);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i13] = d(f10, a10[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i13] = c(f10, fArr2[binarySearch2], b10, a10);
            }
        }
        return new d2.d(fArr3, iArr);
    }

    private int c(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f10 != fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] >= f10 || i10 == fArr.length - 1) {
                    int i11 = i10 - 1;
                    float f12 = (f10 - fArr[i11]) / (fArr[i10] - fArr[i11]);
                    int i12 = iArr[i10];
                    int i13 = iArr[i11];
                    return Color.argb((int) (f11 * 255.0f), i2.g.j(Color.red(i13), Color.red(i12), f12), i2.g.j(Color.green(i13), Color.green(i12), f12), i2.g.j(Color.blue(i13), Color.blue(i12), f12));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int d(float f10, int i10, float[] fArr, float[] fArr2) {
        float i11;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i12 = 1; i12 < fArr.length; i12++) {
                int i13 = (fArr[i12] > f10 ? 1 : (fArr[i12] == f10 ? 0 : -1));
                if (i13 >= 0 || i12 == fArr.length - 1) {
                    if (i13 <= 0) {
                        i11 = fArr2[i12];
                    } else {
                        int i14 = i12 - 1;
                        i11 = i2.g.i(fArr2[i14], fArr2[i12], (f10 - fArr[i14]) / (fArr[i12] - fArr[i14]));
                    }
                    return Color.argb((int) (i11 * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    @Override // g2.n0
    /* renamed from: e */
    public d2.d a(h2.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = cVar.L() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        while (cVar.l()) {
            arrayList.add(Float.valueOf((float) cVar.w()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f30506a = 2;
        }
        if (z10) {
            cVar.e();
        }
        if (this.f30506a == -1) {
            this.f30506a = arrayList.size() / 4;
        }
        int i10 = this.f30506a;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f30506a * 4; i13++) {
            int i14 = i13 / 4;
            double floatValue = arrayList.get(i13).floatValue();
            int i15 = i13 % 4;
            if (i15 == 0) {
                if (i14 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i14 - 1] >= f11) {
                        fArr[i14] = f11 + 0.01f;
                    }
                }
                fArr[i14] = (float) floatValue;
            } else if (i15 == 1) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i15 == 2) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i15 == 3) {
                iArr[i14] = Color.argb(255, i11, i12, (int) (floatValue * 255.0d));
            }
        }
        return b(new d2.d(fArr, iArr), arrayList);
    }
}
