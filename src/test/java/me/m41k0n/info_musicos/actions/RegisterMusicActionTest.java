package me.m41k0n.info_musicos.actions;

import jakarta.persistence.EntityNotFoundException;
import me.m41k0n.info_musicos.entity.MusicEntity;
import me.m41k0n.info_musicos.repository.ArtistRepository;
import me.m41k0n.info_musicos.repository.MusicRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class RegisterMusicActionTest {

    @Mock
    private ArtistRepository artistRepository;

    @Mock
    private MusicRepository musicRepository;

    @InjectMocks
    private RegisterMusicAction registerMusicAction;

    @Test
    public void testTransactionRollback() {
        MockitoAnnotations.openMocks(this);
        when(artistRepository.findByName(anyString())).thenThrow(new EntityNotFoundException("Artista não encontrado"));

        assertThrows(EntityNotFoundException.class, () -> {
            registerMusicAction.executeInternal("Nome da Música", "Nome do Álbum", "Nome do Artista");
        });

        verify(musicRepository, never()).save(any(MusicEntity.class));
    }
}