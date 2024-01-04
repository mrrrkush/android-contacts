package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        return newItem.theSameAs(oldItem);
    }

    @Override
    public boolean areContentsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        return newItem.equals(oldItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NotNull T oldItem, @NotNull T newItem) {
        return newItem;
    }
}
