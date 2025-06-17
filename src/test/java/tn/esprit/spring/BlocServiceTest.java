package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Repositories.BlocRepository;
import tn.esprit.spring.DAO.Repositories.ChambreRepository;
import tn.esprit.spring.DAO.Repositories.FoyerRepository;
import tn.esprit.spring.Services.Bloc.BlocService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BlocServiceTest {

    @Mock
    BlocRepository blocRepository;

    @Mock
    ChambreRepository chambreRepository;

    @Mock
    FoyerRepository foyerRepository;

    @InjectMocks
    BlocService blocService;

    @Test
    void testFindById() {
        Bloc bloc = Bloc.builder()
                .idBloc(1L)
                .nomBloc("Bloc A")
                .capaciteBloc(10)
                .build();

        when(blocRepository.findById(1L)).thenReturn(Optional.of(bloc));

        Bloc found = blocService.findById(1L);

        assertNotNull(found);
        assertEquals("Bloc A", found.getNomBloc());
        verify(blocRepository).findById(1L);
    }
}