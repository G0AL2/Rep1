package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes2.dex */
interface a {
    void b(View view, int i10, int i11, b bVar);

    int c(int i10, int i11, int i12);

    View d(int i10);

    int e(int i10, int i11, int i12);

    int f(View view);

    void g(b bVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View h(int i10);

    void i(int i10, View view);

    int j(View view, int i10, int i11);

    boolean k();

    void setFlexLines(List<b> list);
}
