/*
 * Copyright (C) 2015 PÂRIS Quentin
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

package com.playonlinux.library.entities;

import com.playonlinux.core.entities.Entity;

import java.net.URL;

public class InstalledApplicationEntity implements Entity {
    private final URL icon;
    private final String name;

    public InstalledApplicationEntity(Builder builder) {
        this.name = builder.name;
        this.icon = builder.icon;
    }

    public String getName() {
        return name;
    }

    public URL getIcon() {
        return icon;
    }

    public static class Builder {
        private String name;
        private URL icon;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withIcon(URL icon) {
            this.icon = icon;
            return this;
        }

        public InstalledApplicationEntity build() {
            return new InstalledApplicationEntity(this);
        }
    }
}
