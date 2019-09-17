package com.plugin.component.support.transform

import com.quinn.hunter.transform.asm.BaseWeaver
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter

class MethodCostWeaver extends BaseWeaver {

    @Override
    protected ClassVisitor wrapClassWriter(ClassWriter classWriter) {
        return new MethodCostAdapter(classWriter)
    }
}
