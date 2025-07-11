/*
 *
 * Copyright (c) 2025, Advanced Micro Devices, Inc.
 * All rights reserved.
 *
 * Author: Chris Lavin, AMD Advanced Research and Development.
 *
 * This file is part of RapidWright.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.xilinx.rapidwright.gui;

import com.trolltech.qt.gui.QTreeWidgetItem;
import com.xilinx.rapidwright.edif.EDIFHierCellInst;

/**
 * Wrapper class to store hierarchical instance reference with tree widget item.
 */
public class HierCellInstTreeWidgetItem extends QTreeWidgetItem {

    private EDIFHierCellInst inst;

    public HierCellInstTreeWidgetItem(QTreeWidgetItem parent) {
        super(parent);
    }

    public void setInst(EDIFHierCellInst inst) {
        this.inst = inst;
    }

    public EDIFHierCellInst getInst() {
        return inst;
    }


}
