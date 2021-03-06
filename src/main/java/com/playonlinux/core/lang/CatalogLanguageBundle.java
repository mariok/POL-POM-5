/*
 * Copyright (C) 2015 Jonas Konrad
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.playonlinux.core.lang;

import com.google.common.base.Preconditions;
import org.fedorahosted.tennera.jgettext.Catalog;
import org.fedorahosted.tennera.jgettext.Message;

/**
 * Language bundle from gnu gettext PO files using jgettext.
 */
public class CatalogLanguageBundle implements LanguageBundle {
    private final Catalog catalog;

    public CatalogLanguageBundle(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String translate(String toTranslate) {
        // toTranslate null check below
        return translate(null, toTranslate);
    }

    @Override
    public String translate(String context, String toTranslate) {
        Preconditions.checkNotNull(toTranslate, "toTranslate");

        Message message = catalog.locateMessage(context, toTranslate);
        if (message == null) {
            return toTranslate;
        } else {
            return message.getMsgstr();
        }
    }
}
