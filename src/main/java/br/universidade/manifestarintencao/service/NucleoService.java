@Service
public class NucleoService {
    private final NucleoRepository nucleoRepository;

    public NucleoService(NucleoRepository nucleoRepository) {
        this.nucleoRepository = nucleoRepository;
    }

    public Nucleo salvarNucleo(Nucleo nucleo) {
        if (nucleo.getNome() == null || nucleo.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do núcleo é obrigatório");
        }
        return nucleoRepository.save(nucleo);
    }

    public List<Nucleo> listarTodosNucleos() {
        return nucleoRepository.findAll();
    }
}