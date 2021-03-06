package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
abstract class zzex<E> extends AbstractList<E> implements zzgz<E> {
    private boolean zzrj = true;

    zzex() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzdq();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzdq();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzdq();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzdq();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzdq();
        super.clear();
    }

    public boolean zzdo() {
        return this.zzrj;
    }

    public final void zzdp() {
        this.zzrj = false;
    }

    public E remove(int i) {
        zzdq();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzdq();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzdq();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzdq();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzdq();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzdq() {
        if (!this.zzrj) {
            throw new UnsupportedOperationException();
        }
    }
}
